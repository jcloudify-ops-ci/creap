package com.creap.apo.file.hash;

import com.creap.apo.PojaGenerated;

@PojaGenerated
public record FileHash(FileHashAlgorithm algorithm, String value) {}
