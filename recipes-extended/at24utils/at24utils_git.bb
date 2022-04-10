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
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/tanzilli/at24mac.git;branch=master"

# Modify these as desired
PV = "1.0+git${SRCPV}"
SRCREV = "9536cc5ed2ca7259ad5f352c0783d7eb0cdf39da"

S = "${WORKDIR}/git"

# NOTE: no Makefile found, unable to determine what needs to be done

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	${CC} ${CFLAGS} ${LDFLAGS} ${S}/at24mac.c -o ${B}/at24mac
	${CC} ${CFLAGS} ${LDFLAGS} ${S}/at24serial.c -o ${B}/at24serial
}

FILES_${PN} += " \
	/usr/bin/at24mac \
	/usr/bin/at24serial \
	"

do_install () {
	install -m 0755 -D ${B}/at24mac ${D}/usr/bin/at24mac
	install -m 0755 -D ${B}/at24serial ${D}/usr/bin/at24serial
}

