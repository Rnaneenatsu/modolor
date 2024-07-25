List<String> list = Arrays.asList("a", "b", "c", "d", "e");
List<String> result = list.stream()
        .filter(s -> s.length() > 1)
        .collect(Collectors.toList());
