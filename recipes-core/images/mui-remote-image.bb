inherit core-image

#cmake, qmake, lkm sdk opts
#TOOLCHAIN_HOST_TASK += "nativesdk-cmake"
#TOOLCHAIN_TARGET_TASK += "kernel-devsrc"

TOOLS = " \
    i2c-tools \
    evtest \
    beep \
    raspi-gpio \
"
DISTRO_FEATURES:append = " bluez5 bluetooth wifi"

IMAGE_INSTALL:append = " \
    ${TOOLS} \
"
