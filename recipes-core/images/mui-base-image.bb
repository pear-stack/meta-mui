inherit core-image

#sdk opts
#TOOLCHAIN_HOST_TASK:append = " nativesdk-slint-cpp"
#TOOLCHAIN_HOST_TASK:append = " nativesdk-cmake"
#CLANGSDK = "1"
#TOOLCHAIN_TARGET_TASK += "kernel-devsrc"

UI = " \
    slint-cpp \
    slint-hello-world \
    noto-fonts \
    libudev \
    mesa-megadriver \
    libgles2-mesa \
    libegl-mesa \
    libgbm \
"

TOOLS = " \
    i2c-tools \
    evtest \
    beep \
    raspi-gpio \
"
DISTRO_FEATURES:append = " bluez5 bluetooth wifi"

IMAGE_INSTALL:append = " \
    ${UI} \
    ${TOOLS} \
"
