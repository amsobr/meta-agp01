COMPATIBLE_MACHINE = "(sama5d2-xplained|sama5d2-xplained-sd|sama5d2-xplained-emmc|sama5d2-ptc-ek|sama5d2-ptc-ek-sd|sama5d27-som1-ek|sama5d27-som1-ek-sd|sama5d4-xplained|sama5d4-xplained-sd|sama5d4ek|sama5d3-xplained|sama5d3-xplained-sd|sama5d3xek|at91sam9x5ek|at91sam9m10g45ek|at91sam9rlek|sama5d2-icp-sd|sam9x60ek|sam9x60ek-sd|sama5d27-wlsom1-ek-sd|sama5d3-agp01)"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-add-agp01-devicetree.patch \
            file://0001-fix-erratic-gpio-behaviour.patch file://0002-enable-spi-and-at24mac-eeprom-in-dts.patch \
            "

