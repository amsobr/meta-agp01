DESCRIPTION = "AGP01 DAQ system firmware"
LICENSE = "MIT"
PR = "r1"

IMAGE_FEATURES += "ssh-server-openssh package-management"

IMAGE_INSTALL = "\
    packagegroup-core-boot \
    packagegroup-core-full-cmdline \
    packagegroup-base-usbgadget \
    kernel-modules \
    lrzsz \
    setserial \
    opkg \
    iperf3 \
    \
    nbench-byte \
    lmbench \
    \
    i2c-tools \
    devmem2 \
    libgpiod-tools \
    dosfstools \
    libdrm-tests \
    mtd-utils \
    mtd-utils-ubifs \
    dtc \
    dtc-misc \
    iproute2 \
    iptables \
    bridge-utils \
    can-utils \
    evtest \
    python3-pyserial \
    python3-smbus \
    python3-ctypes \
    python3-pip \
    gdb \
    usbutils \
    wget \
    9bit \
    rng-tools \
    net-tools \
    nftables \
    phytool \
    tcpdump \
    dhcp-server \
    dhcp-server-config \
    ${CORE_IMAGE_EXTRA_INSTALL} \
    \
    iotool \
    "

inherit core-image


