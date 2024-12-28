FILESEXTRAPATHS:prepend := "${THISDIR}/slint-cpp:"
PACKAGECONFIG:append:pn-slint-cpp = " backend-linuxkms renderer-skia"
PACKAGECONFIG:remove:pn-slint-cpp = " renderer-femtovg"

#slint 1.9.0 fix
LICENSE = "GPLv3"
DEPENDS:append:class-target:append = " curl-native"
