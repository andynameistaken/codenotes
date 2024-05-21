from typing import Dict

from easyconf.AbstractPackageManager import AbstractPackageManager


class Brew(AbstractPackageManager):
    def get_installed_packages(self) -> Dict[str, str]:
        pass

    def get_newest_package_versions(self) -> Dict[str, str]:
        pass

    def is_outdated(self, installed_version: str, newest_version: str) -> bool:
        pass

    def get_outdated_packages(self) -> Dict[str, str]:
        pass

    def upgrade_package(self, package_name: str) -> None:
        pass
