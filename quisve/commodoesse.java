private static String[] splitVersionInfo(String version) {
    // Assuming your inputs are strings
    String v1 = "1.23.56.1487";
    String v2 = "1.24.55.487";
    var version1 = new Version(v1);
    var version2 = new Version(v2);
    var result = version1.compareTo(version2);
    if (result > 0)
        System.out.println("version1 is greater");
    else if (result < 0)
        System.out.println("version2 is greater");
    else
        System.out.println("versions are equal");
    return new String[]{};
}
