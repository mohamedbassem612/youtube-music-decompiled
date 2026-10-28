package com.google.android.libraries.elements.interfaces;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ForeignFunctionArgs {
    final BlockRegistryRefViewProvider blockRegistryProvider;
    final byte[] inputBytes;

    public ForeignFunctionArgs(byte[] bArr, BlockRegistryRefViewProvider blockRegistryRefViewProvider) {
        this.inputBytes = bArr;
        this.blockRegistryProvider = blockRegistryRefViewProvider;
    }

    public BlockRegistryRefViewProvider getBlockRegistryProvider() {
        return this.blockRegistryProvider;
    }

    public byte[] getInputBytes() {
        return this.inputBytes;
    }

    public String toString() {
        BlockRegistryRefViewProvider blockRegistryRefViewProvider = this.blockRegistryProvider;
        return "ForeignFunctionArgs{inputBytes=" + String.valueOf(this.inputBytes) + ",blockRegistryProvider=" + String.valueOf(blockRegistryRefViewProvider) + '}';
    }
}
