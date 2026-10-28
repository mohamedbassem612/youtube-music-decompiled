#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -ne 4 ]; then
  echo 'Usage: scripts/build-apk.sh DECODED_DIRECTORY APKTOOL.jar SIGNER.jar OUTPUT_DIRECTORY' >&2
  exit 2
fi
project=$(realpath "$1")
apktool=$(realpath "$2")
signer=$(realpath "$3")
out=$4
if [ -e "$out" ]; then
  echo "Output already exists: $out" >&2
  exit 1
fi
mkdir -p "$out"
out=$(realpath "$out")
java -jar "$apktool" b "$project" -o "$out/unsigned.apk"
java -jar "$signer" --apks "$out/unsigned.apk" --out "$out/signed"
echo "Signed APK: $out/signed/unsigned-aligned-debugSigned.apk"
