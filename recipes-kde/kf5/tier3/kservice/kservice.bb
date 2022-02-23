SUMMARY = "Advanced plugin and service introspection"
LICENSE = "GPL-2.0 & GPL-2.0+ & GPL-3.0 & LGPL-2.0 & LGPL-2.0+ & LGPL-2.1 & LGPL-3.0"
LIC_FILES_CHKSUM = " \
    file://LICENSES/GPL-2.0-only.txt;md5=93e64b4a83c7e441e48bbdeeea05c977 \
    file://LICENSES/GPL-2.0-or-later.txt;md5=fed54355545ffd980b814dab4a3b312c \
    file://LICENSES/GPL-3.0-only.txt;md5=1c76c4cc354acaac30ed4d5eefea7245 \
    file://LICENSES/LGPL-2.0-only.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.0-or-later.txt;md5=6d2d9952d88b50a51a5c73dc431d06c7 \
    file://LICENSES/LGPL-2.1-only.txt;md5=fabba2a3bfeb22a6483d44e9ae824d3f \
    file://LICENSES/LGPL-3.0-only.txt;md5=c51d3eef3be114124d11349ca0d7e117 \
"

inherit kde-kf5 gettext

DEPENDS += " \
    bison-native \
    kconfig-native kconfig \
    kdoctools-native kdoctools \
    kcoreaddons-native \
    kconfig \
    kcrash \
    kdbusaddons \
    ki18n \
"

PV = "${KF5_VERSION}"
SRC_URI[sha256sum] = "779d11c436887c5300c6f3bf477ba334673444b3e9d3212a0cf12a1f653b9254"

FILES:${PN} += "${datadir}/kservicetypes5"
