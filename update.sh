#!/bin/bash

set -e

gradle jsweet

rm -rf webapp/javascript
rm -rf webapp/candies

mkdir -p webapp/javascript
cp -a build/target/javascript/bundle.js* webapp/javascript
