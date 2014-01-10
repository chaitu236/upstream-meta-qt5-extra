DESCRIPTION = "Simple video player for the Hawaii desktop environment"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://src/main.cpp;beginline=9;endline=24;md5=abd5b11c017f98f28850382a61e02a30"

inherit qmake5

DEPENDS = "qtbase qtdeclarative qtquickcontrols qtmultimedia fluid"

SRC_URI = " \
	git://github.com/mauios/cinema.git;protocol=git;branch=dev \
	file://0001-Make-install-work.patch \
"
SRCREV = "ad3ac6952aca6854b6df7e01e48f10a858dd2529"
PV = "git${SRCPV}"

S = "${WORKDIR}/git"

# Set path of qt5 headers as qmake5_base.bbclass sets this to just 
# ${includedir} but actually it is ${includedir}/qt5
OE_QMAKE_PATH_HEADERS = "${OE_QMAKE_PATH_QT_HEADERS}"
