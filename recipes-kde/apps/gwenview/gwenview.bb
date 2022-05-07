SUMMARY = "A fast and easy to use image viewer for KDE"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b"

inherit kde-apps gettext mime-xdg

DEPENDS += " \
    kdelibs4support-native \
    kdoctools-native \
    jpeg \
    exiv2 \
    lcms \
    phonon \
    kdelibs4support \
    kded \
    kactivities \
    kcoreaddons-native \
    kconfig-native \
    kauth-native \
    sonnet-native \
    kxmlgui \
    kfilemetadata \
    baloo \
    libkdcraw \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[sha256sum] = "73683096898c59388cd566cc8f71d7677fd0b22a2ab42a6d5f82f1232372ab05"

EXTRA_OECMAKE += " \
    -DJPEGLIB_RUN_RESULT=true \
    -DJPEGLIB_RUN_RESULT__TRYRUN_OUTPUT=0 \
"

FILES:${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/icons \
    ${datadir}/solid \
    ${datadir}/kconf_update \
    ${OE_QMAKE_PATH_PLUGINS} \
"
