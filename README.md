# AGP01 DAQ firmware

This layer provides support for the AGP01 DAQ board

The AGP01 DAQ is built on the acmesystems ACQUA SOM, which is mostly
compatible with the SAMA5D3-xplained development board from ATMEL/MICROCHIP.

## Buildable artifacts

The available targets for AGP01 are:
 * *agp01-fw* - firmware for the board
 * *agp01-toolchain* - installable toolchain (SDK) for the board
 
The available machines for AGP01 are:
 * *sama5d3-agp01* - this configuration boots and runs from the micro-SD card.
                   
 
This layer depends and is loosely based on meta-atmel and poky.
git://github.com/linux4sam/meta-atmel.git - antherefore other atmel machines and
images may be available for building.



## Sources and Dependencies
| layer                 | URL                                            | branch  |
|-----------------------|------------------------------------------------|---------|
| **meta-agp01 (this)** | https://github.com/amsobr/meta-agp01           | dunfell |
| **meta-atmel**        | https://github.com/linux4sam/meta-atmel.git    | dunfell |
| **meta-openembedded** | https://git.openembedded.org/meta-openembedded | dunfell |
| **poky**              | git://git.yoctoproject.org/poky                | dunfell |


## Proposed directory structure

The proposed directory structure groups metadata and build artifacts in separate
subdirectories. This makes it easier to lookup bitbake metadata without going
through millions of compilation byproducts when looking for a certain file or
expression.

In addition, keeping the build directories separate from the metadata also
allows them to be found and deleted quickly

This layer contains a bitbake configuration template that works on the following
directory structure:

```text
* TOPDIR
* TOPDIR/sources/                       <-- metadata
** TOPDIR/sources/meta-agp01
** TOPDIR/sources/meta-atmel
** TOPDIR/sources/poky
** TOPDIR/sources/meta-openembedded
** TOPDIR/build/*                       <-- build directories
```

## Setting and building

1. Create and enter a directory
```
mkdir -p agp01-daq/sources
cd agp01-daq/sources
```

2. Clone all dependencies and select the appropriate branche
```
git clone https://github.com/amsobr/meta-agp01.git -b dunfell
git clone git://git.yoctoproject.org/poky -b dunfell
git clone git://git.openembedded.org/meta-openembedded -b dunfell
git clone git://github.com/linux4sam/meta-atmel.git -b dunfell
```

3. Change poky/.templateconf content to:
`export TEMPLATECONF=${TEMPLATECONF:-../meta-agp01/conf}`


4. Enter poky subdirectory and initialize the build directory
```
cd poky
. oe-init-build-env ../../build
```

After this final step the working directory becomes TOPDIR/build/ and bitbake
and devtool commands are available.

### Building the firmware

To build the firmware run the following command:
```
bitbake agp01-fw
```

To build an installable toolchain that may be used for cross-compilation to the
AGP01 run the following command:
```
bitbake agp01-toolchain
```

Both commands take a considerable amount of time to execute, especially when
ran for the first time.

Output files:
* **SD card image:** TOPDIR/build/tmp/deploy/images/sama5d3-agp01/agp0-fw-sama5d3-agp01.wic - sdcard image
* **toolchain:** TOPDIR/build/tmp/deploy/sdk/poky-atmel-glibc-x86_64-agp01-toolchain-cortexa5t2hf-vfp-sama5d3-agp01-toolchain-VERSION.sh

# Development

For more information about yocto and openembedded, a good place to get started
is https://docs.yoctoproject.org/ .
