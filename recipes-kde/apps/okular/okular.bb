SUMMARY = "KDE document viewer"
LICENSE = "GPLv2 & GFDL-1.2 & LGPL-2.1"
LIC_FILES_CHKSUM = " \
    file://COPYING;md5=5a3169a2d39a757efd8b7aa66a69d97b \
    file://COPYING.LIB;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
    file://COPYING.DOC;md5=24ea4c7092233849b4394699333b5c56 \
"

inherit kde-apps gtk-icon-cache

DEPENDS += " \
    libkexiv2 \
    qca \
    tiff \
    kpty \
    poppler \
    kactivities \
    karchive \
    kbookmarks \
    kcompletion \
    kconfig \
    kconfigwidgets \
    kcoreaddons \
    kdbusaddons \
    kdoctools \
    kiconthemes \
    kjs \
    kio \
    kparts \
    threadweaver \
    kwallet \
    khtml \
    kwindowsystem \
"

PV = "${KDE_APP_VERSION}"
SRC_URI[md5sum] = "a9c47357a9d848b86df03a4a4977b7d5"
SRC_URI[sha256sum] = "6dd55badaa1dbdacd5bc412a2f34c5f027e51873c89166a6f8c6015608120f29"

FILES_${PN} += " \
    ${datadir}/k*5 \
    ${datadir}/kconf_update \
    ${datadir}/config.kcfg \
    ${datadir}/kpackage \
    ${OE_QMAKE_PATH_PLUGINS} \
    ${OE_QMAKE_PATH_QML}/org \
"

FILES_${PN}-dbg += " \
"
