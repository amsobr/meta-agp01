# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   debian/copyright
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://debian/copyright;md5=a1092a364d171e5a94dd11be26420121"

SRC_URI = "http://sg.danny.cz/foxg20/sama5d3/sama5d3_utils-${PV}.tar.xz"
SRC_URI[md5sum] = "7d15ea47748d37a3b499812404851633"
SRC_URI[sha1sum] = "9db49cf8e007f70717c52ecf6e807dda7354225e"
SRC_URI[sha256sum] = "afdde86f07f74c3d0ec0bc71983017224044f37c7f8735c886591011944b163d"
SRC_URI[sha384sum] = "e7fcce8c52275fc3182128ca3246088455ff1d7b07c806d80ec631b275f1d98c7da0efa686fdc3b406b6ff170c0f3631"
SRC_URI[sha512sum] = "ac71956fbad16b5cd7f8a2b39b11326d774c6d4718ee959b3a5c63ad323ac136f5b147dbdce275d90c6aacf7dbccc1eec064867d05b88f40864c7259b2f653bb"

S = "${WORKDIR}/sama5d3_utils-${PV}"

FILES_${PN}-doc += " \
	/usr/local/share/* \
	"
	
FILES_${PN} += " \
	/usr/local/bin/* \
	"

# NOTE: this is a Makefile-only piece of software, so we cannot generate much of the
# recipe automatically - you will need to examine the Makefile yourself and ensure
# that the appropriate arguments are passed in.

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# You will almost certainly need to add additional arguments here
	oe_runmake
}

do_install () {
	# This is a guess; additional arguments may be required
	oe_runmake install 'DESTDIR=${D}'
}

