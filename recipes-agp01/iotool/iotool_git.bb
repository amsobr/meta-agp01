# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=10173fd683c6fedc873a3678bc626401"

DEPENDS += " \
    poco \
    libgpiod \
    "

RDEPENDS_${PN}  += " \
        poco \
        "

SRC_URI = "git://git@github.com/amsobr/iotool.git;protocol=ssh;branch=develop"

# Modify these as desired
PV = "0.5.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit cmake

# Specify any options you want to pass to cmake using EXTRA_OECMAKE:
EXTRA_OECMAKE = "-DBOARD_NAME=agp01"

