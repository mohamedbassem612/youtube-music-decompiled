package com.google.cardboard.sdk.qrcode;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class OutputStreamProvider {
    private static Provider provider = new BufferedProvider();

    /* JADX INFO: compiled from: PG */
    class BufferedProvider implements Provider {
        @Override // com.google.cardboard.sdk.qrcode.OutputStreamProvider.Provider
        public OutputStream get(File file) {
            return new BufferedOutputStream(new FileOutputStream(file));
        }
    }

    /* JADX INFO: compiled from: PG */
    public interface Provider {
        OutputStream get(File file);
    }

    private OutputStreamProvider() {
    }

    public static OutputStream get(File file) {
        return provider.get(file);
    }

    public static Provider getDefaultProvider() {
        return new BufferedProvider();
    }

    public static void setProvider(Provider provider2) {
        provider = provider2;
    }
}
