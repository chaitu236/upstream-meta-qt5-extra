SUMMARY = "Extensible deamon for providing system level services"
LICENSE = "LGPL-2.0 & LGPL-2.0+"
LIC_FILES_CHKSUM = " \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
"

inherit kde-kf5

DEPENDS += " \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kcoreaddons-native kcoreaddons \
    kcrash \
    kdbusaddons \
    kinit \
    kservice \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "4157de65d9acc6620da42f777c6fc56ef4ecb846cd3b80db5e349b35dc1f736a"
SRC_URI += "file://0001-hardcode-path-to-kconf_update.patch"

FILES_${PN} += " \
    ${datadir}/dbus-1 \
    ${datadir}/k*5 \
    ${libdir}/libkdeinit5_kded5.so \
    ${systemd_user_unitdir} \
"
FILES_${PN}-dev = "${libdir}/cmake"
