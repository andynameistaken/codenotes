from typing import Dict
from abc import ABC, abstractmethod


class AbstractPackageManager(ABC):
    @abstractmethod
    def get_installed_packages(self) -> Dict[str, str]:
        """Retrieve a dictionary of installed packages"""
        pass

    @abstractmethod
    def get_newest_package_versions(self) -> Dict[str, str]:
        """Get the newest versions of packages"""
        pass

    @abstractmethod
    def is_outdated(self, installed_version: str, newest_version: str) -> bool:
        """Check if installed_version is older than newest_version"""
        pass

    @abstractmethod
    def get_outdated_packages(self) -> Dict[str, str]:
        """Get a dictionary of outdated packages"""

    @abstractmethod
    def upgrade_package(self, package_name: str) -> None:
        """Upgrade a specific package"""
        pass
