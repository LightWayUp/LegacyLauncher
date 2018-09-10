# LegacyLauncher

> Hacky code to launch our old versions from the new launcher!

## Motivation
Mojang is no longer active on LegacyLauncher development. However, many Minecraft modifications rely on it.  
This fork combines improvements from almost all other forks that stick to the original intention of LegacyLauncher. You can use this fork if you don't like the outdated LegacyLauncher from Mojang, or you want to play old Minecraft versions or use mods with newer Java versions.

## Compatibility
Support for Java 9 and above has been added, and minimum requirement is raised to Java 8.  
Once compiled with "group" and "version" set properly in [build.gradle](/build.gradle), the output "launchwrapper-X.Y.jar" is compatible with Minecraft versions using LegacyLauncher.

## Installation
To use this, download the pre-compiled LegacyLauncher binary from the [Releases page](https://github.com/LightWayUp/LegacyLauncher/releases/latest). You can also download the source, change "group" and "version" according to the instructions in [build.gradle](/build.gradle), then compile it.

Once you have the "launchwrapper-X.Y.jar" file, place it in the Minecraft launchwrapper library folder with correct version number.  
Example for Windows devices: If you are using "1.13" LegacyLauncher release, put the "launchwrapper-1.13.jar" in `%APPDATA%\.minecraft\libraries\net\minecraft\launchwrapper\1.13\`.  
**Please note that Minecraft version does not matter with LegacyLauncher version number!**

## Contributing
I periodically check all visible forks and merge changes into mine. If you want to contribute, just fork the original project from Mojang, and create your own edits.

## License
The original LegacyLauncher doesn't have any license specified. Therefore, this fork would not add any license information.
