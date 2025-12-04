# --- STAGE 1: ビルド環境 ---
# Java 17 ではなく Java 21 の環境を使う
FROM gradle:8-jdk21 AS builder

WORKDIR /app
COPY . .
# -x test オプションをつけることで、テストタスクを除外する
RUN gradle build --no-daemon -x test -x generateJooq

# --- STAGE 2: 実行環境 ---
# 実行環境も Java 17 ではなく 21 に合わせる
FROM eclipse-temurin:21-jre

WORKDIR /app

# "builder" (STAGE 1) から、ビルドされた .jar ファイルだけをコピーする
COPY --from=builder /app/build/libs/*.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]