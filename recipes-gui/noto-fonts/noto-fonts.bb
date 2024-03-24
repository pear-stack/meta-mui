LICENSE = "CLOSED"
FILES:${PN} += "/usr/share/fonts/*"
SRC_URI += "file://Noto_Sans.zip"

do_install () {
    install -d ${D}/usr/share/fonts
    install -m 0755 ${WORKDIR}/static/*.ttf ${D}/usr/share/fonts
}
