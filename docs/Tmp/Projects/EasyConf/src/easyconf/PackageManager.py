from typing import Dict

def get_installed_packages() -> Dict[str, str]:
    # Implement logic to get installed packages
    raise NotImplementedError("get_installed_packages is not implemented")


def get_newest_package_versions() -> Dict[str, str]:
    # Implement logic to get newest package versions
    raise NotImplementedError("get_new_package_versions is not implemented")

def is_outdated(installed_version: str, newest_version: str) -> bool:
    # Implement logic to check if installed_version is older than newest_version
    raise NotImplementedError("is_outdated is not implemented")

def get_outdated_packages(installed_packages: Dict[str, str], 
                            newest_packages: Dict[str, str]) -> Dict[str, str]:
    # c
    return {pkg: newest_packages[pkg] for pkg in installed_packages
            if pkg in newest_packages and is_outdated(installed_packages[pkg], newest_packages[pkg])}

def upgrade_package(package_name: str) -> None:
    # Implement logic to upgrade a package
    raise NotImplementedError("upgrade_package is not implemented")
