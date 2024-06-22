long sourceDuration = 5000; // duration in milliseconds
TimeUnit sourceUnit = TimeUnit.MILLISECONDS;
TimeUnit targetUnit = TimeUnit.SECONDS;

long convertedDuration = targetUnit.convert(sourceDuration, sourceUnit);
System.out.println("Converted duration: " + convertedDuration + " seconds");
