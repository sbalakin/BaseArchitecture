import java.nio.file.Files
import java.nio.file.FileSystems
import java.util.stream.Collectors

include(":app")

fun includePackage(packageName: String): Array<String> {
    val fs = FileSystems.getDefault()
    val root = fs.getPath(rootDir.toString(), packageName)
    return Files.find(root, 1, { file, _ ->
        Files.isDirectory(file) && Files.exists(fs.getPath(file.toString(), "build.gradle.kts"))
    })
        .map { ":${it.parent.fileName}:${it.fileName}" }
        .collect(Collectors.toList())
        .toTypedArray()
}


include(
    *includePackage("core"),
    *includePackage("feature")
)

rootProject.name = "Dagger2"