SUMMARY = "IPython: Productive Interactive Computing"
HOMEPAGE = "https://ipython.org"
AUTHOR = "The IPython Development Team <ipython-dev@python.org>"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING.rst;md5=59b20262b8663cdd094005bddf47af5f"

PYPI_PACKAGE = "ipython"

SRC_URI[sha256sum] = "70e5eb132cac594a34b5f799bd252589009905f05104728aea6a403ec2519dc1"

RDEPENDS:${PN} = "\
    ${PYTHON_PN}-setuptools \
    ${PYTHON_PN}-jedi \
    ${PYTHON_PN}-decorator \
    ${PYTHON_PN}-pickleshare \
    ${PYTHON_PN}-traitlets \
    ${PYTHON_PN}-prompt-toolkit \
    ${PYTHON_PN}-pygments \
    ${PYTHON_PN}-backcall \
    ${PYTHON_PN}-pydoc \
    ${PYTHON_PN}-debugger \
    ${PYTHON_PN}-pexpect \
    ${PYTHON_PN}-unixadmin \
    ${PYTHON_PN}-misc \
    ${PYTHON_PN}-sqlite3 \
"

inherit setuptools3 pypi
