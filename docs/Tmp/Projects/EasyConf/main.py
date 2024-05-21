from typing import Dict

def get_installed_packages() -> Dict[str, str]:
    # In a real scenario, this would involve reading from the system's package manager
    return {"numpy": "1.18.1", "pandas": "1.0.3", "scipy": "1.4.0"}


def get_newest_package_versions() -> Dict[str, str]:
    # This would typically involve querying a package repository
    return {"numpy": "1.18.5", "pandas": "1.0.3", "scipy": "1.5.1"}

def is_outdated(installed_version: str, newest_version: str) -> bool:
    return installed_version < newest_version


def get_outdated_packages(installed_packages: Dict[str, str], newest_packages: Dict[str, str]) -> Dict[str, str]:
    return {pkg: newest_packages[pkg] for pkg in installed_packages
            if pkg in newest_packages and is_outdated(installed_packages[pkg], newest_packages[pkg])}


def upgrade_package(package_name: str) -> None:
    # Simulate package upgrade
    print(f"Upgrading {package_name}...")


installed = get_installed_packages()
newest = get_newest_package_versions()
outdated = get_outdated_packages(installed, newest)

for pkg in outdated:
    upgrade_package(pkg)
