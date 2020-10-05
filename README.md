# oo_boot_camp_2020-10-06_kotlin

Copyright (c) 2019 by Fred George.
May be used freely except for training; license required for training.

OO Boot Camp in Kotlin for Oslo employer client in November 2019

Kotlin is relatively easy to setup with IntelliJ IDEA. The following instructions are for installing
the code in IntelliJ 2018 by JetBrains. Adapt as necessary for your environment.

## IntelliJ setup

Note: The original was setup to use Kotlin 1.3, Java SDK 12, and JUnit 5-style for testing.

Open the reference code:

- Download the source code from github.com/fredgeorge
  - Clone, or pull and extract the zip
- Open IntelliJ
- Choose "Open" (and NOT Gradle build or import)
- Navigate to the reference code root, and enter

Source and test directories should already be tagged as such. Confirm or fix:

- File/Project Structure...
- Select "Modules"
  - Tag src directory as Sources in *exercises* module
  - Tag test directory as Tests in *tests* module
  - Click "OK"

Confirm that everything builds correctly (and necessary libraries exist)
