# LegacyLauncher
> Hacky code to launch our old versions from the new launcher!

## Badges
[![Java 9 and above](https://img.shields.io/badge/Java%20compatibility-9%20and%20above-f80000.svg?longCache=true&style=flat-square&logo=java)](https://jdk.java.net/) [![View latest release](https://img.shields.io/badge/release-latest-36b030.svg?longCache=true&style=flat-square&logo=github)][Latest release] [![Join Discord to chat!](https://img.shields.io/badge/chat-on%20Discord-7289da.svg?longCache=true&style=flat-square&logo=discord)](https://discord.gg/ZzU43gJ)

## Motivation
Mojang is no longer active on LegacyLauncher development. However, many Minecraft modifications rely on it.  
This fork incorporates improvements from almost all other forks that stick to the original intention of LegacyLauncher. You can use this fork if you don't like the outdated LegacyLauncher from Mojang, or you want to play old Minecraft versions or use mods with newer Java versions.

## Compatibility
Support for Java 9 and above has been added, and minimum requirement is raised to Java 9.  
Once compiled with "group" and "version" set properly in [build.gradle](/build.gradle), the output "launchwrapper-X.Y.jar" (where X.Y is the version of LegacyLauncher) is compatible with Minecraft.

## Installation
To use this, download the pre-compiled LegacyLauncher binary from the [Releases page][Latest release]. You can also download the source, change "group" and "version" according to the instructions in [build.gradle](/build.gradle), then compile it.

Once you have "launchwrapper-X.Y.jar" (where X.Y is the version of LegacyLauncher), place it in the Minecraft launchwrapper library folder with correct version number.  
Example for Windows environment: If you are using "1.13" LegacyLauncher release, put the "launchwrapper-1.13.jar" in `%APPDATA%\.minecraft\libraries\net\minecraft\launchwrapper\1.13\`.  
**Please note that Minecraft version does not matter with LegacyLauncher version number!**

## Contributing
I periodically check all visible forks and merge changes into mine. If you want to contribute, just fork the original project from Mojang, and create your own edits.

## License
The original LegacyLauncher doesn't have any license specified. Therefore, this fork would not add any license information.

[Latest release]: https://github.com/LightWayUp/LegacyLauncher/releases/latest
