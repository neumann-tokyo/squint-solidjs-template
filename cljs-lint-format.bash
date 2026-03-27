#!/bin/bash

set -eu -o pipefail

if [ -z $(which joker) ]; then
    echo "Joker is not installed. Please install it. https://github.com/candid82/joker"
    exit 1
fi

# RUN LINT
joker --lint --working-dir src

# RUN FORMAT
target_files=$(git ls-files | grep -E '\.(cljs|clj|edn)$')

for file in $target_files; do
    joker --format --write $file
done

exit 0
