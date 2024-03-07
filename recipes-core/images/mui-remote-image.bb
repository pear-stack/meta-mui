inherit core-image

#cmake, qmake, lkm sdk opts
#inherit populate_sdk_qt5
#TOOLCHAIN_HOST_TASK += "nativesdk-cmake"
#TOOLCHAIN_TARGET_TASK += "kernel-devsrc"

MY_TOOLS = " \
"
MY_PKGS = " \
"
MY_FEATURES = " \
    i2c-tools \
    evtest \
    beep \
    raspi-gpio \
"
DISTRO_FEATURES:append = " bluez5 bluetooth wifi"

IMAGE_INSTALL:append = " \
    ${MY_FEATURES} \
"
