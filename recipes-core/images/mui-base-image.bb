inherit core-image

#cmake, qmake, lkm sdk opts
#inherit populate_sdk_qt5
#TOOLCHAIN_HOST_TASK += "nativesdk-cmake"
#TOOLCHAIN_TARGET_TASK += "kernel-devsrc"

MY_TOOLS = " \
    qtbase \
    qtbase-dev \
    qtbase-mkspecs \
    qtbase-plugins \
    qtbase-tools \
"

MY_PKGS = " \
    qt3d \
    qt3d-dev \
    qt3d-mkspecs \
    qtimageformats \
    qtmultimedia \
    qtquickcontrols \
    qtcharts \
    qtcharts-dev \
    qtcharts-mkspecs \
    qtconnectivity-dev \
    qtconnectivity-mkspecs \
    qtquickcontrols2 \
    qtquickcontrols2-dev \
    qtquickcontrols2-mkspecs \
    qtdeclarative \
    qtdeclarative-dev \
    qtdeclarative-mkspecs \
    qtgraphicaleffects \
    qtgraphicaleffects-dev \
"
MY_FEATURES = " \
    i2c-tools \
    qt5everywheredemo \
    evtest \
    beep \
    raspi-gpio \
"
DISTRO_FEATURES:append = " bluez5 bluetooth wifi"

IMAGE_INSTALL:append = " \
    ${MY_TOOLS} \
    ${MY_PKGS} \
    ${MY_FEATURES} \
"
