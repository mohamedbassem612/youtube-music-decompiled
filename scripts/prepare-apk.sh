#!/usr/bin/env bash
set -euo pipefail
if [ "$#" -ne 3 ]; then
  echo 'Usage: scripts/prepare-apk.sh INPUT.apk APKTOOL.jar OUTPUT_DIRECTORY' >&2
  exit 2
fi
apk=$(realpath "$1")
apktool=$(realpath "$2")
out=$3
if [ -e "$out" ]; then
  echo "Output already exists: $out" >&2
  exit 1
fi
mkdir -p "$(dirname "$out")"
java -jar "$apktool" d --no-src "$apk" -o "$out"
echo "Decoded project: $out"
