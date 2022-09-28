# Class deduplication Plugin

This is a first **experiment** to deduplicate Java classes (e.g. from generated output).

- `class-dedup-plugin` is the actual Maven plugin that will process the sources
- `use-plugin` is a demo target project, it generates Java from the spark CRD (which is full of duplicates) and process the output with the deduplication plugin
