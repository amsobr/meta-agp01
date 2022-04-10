SUMMARY = "Installable toolchain for AGP01 DAQ"
LICENSE = "MIT"

PR = "r0"

TOOLCHAIN_TARGET_TASK += " \
    poco \
    libgpiod \
    "

#IMAGE_INSTALL_append = " \
#    localedef \
#    glibc-utils \
#    nativesdk-glibc-locale \
#    "

#GLIBC_GENERATE_LOCALES = "en_US.UTF-8"
#IMAGE_LINGUAS ?= "en-us"

#SDK_DEPENDS += " \
#        nativesdk-glibc-locale \
#        nativesdk-localedef \
#        nativesdk-glibc-utils \
#        "

inherit populate_sdk
