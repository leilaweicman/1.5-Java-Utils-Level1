package common;

public class FileInfo {
    private final String name;
    private final boolean isDirectory;
    private final long lastModified;
    private final int level;

    public FileInfo(String name, boolean isDirectory, long lastModified, int level) {
        this.name = name;
        this.isDirectory = isDirectory;
        this.lastModified = lastModified;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public long getLastModified() {
        return lastModified;
    }

    public int getLevel() {
        return level;
    }

}
