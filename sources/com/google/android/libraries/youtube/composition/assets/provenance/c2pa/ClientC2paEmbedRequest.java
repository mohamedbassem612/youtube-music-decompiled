package com.google.android.libraries.youtube.composition.assets.provenance.c2pa;

import com.google.android.libraries.youtube.composition.api.C2paEmbedFileType;
import com.google.protos.c2pa.GenerateManifestStoreRequest;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ClientC2paEmbedRequest {
    final String filePath;
    final C2paEmbedFileType fileType;
    final GenerateManifestStoreRequest manifestStoreRequest;

    public ClientC2paEmbedRequest(GenerateManifestStoreRequest generateManifestStoreRequest, String str, C2paEmbedFileType c2paEmbedFileType) {
        this.manifestStoreRequest = generateManifestStoreRequest;
        this.filePath = str;
        this.fileType = c2paEmbedFileType;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public C2paEmbedFileType getFileType() {
        return this.fileType;
    }

    public GenerateManifestStoreRequest getManifestStoreRequest() {
        return this.manifestStoreRequest;
    }

    public String toString() {
        C2paEmbedFileType c2paEmbedFileType = this.fileType;
        return "ClientC2paEmbedRequest{manifestStoreRequest=" + String.valueOf(this.manifestStoreRequest) + ",filePath=" + this.filePath + ",fileType=" + String.valueOf(c2paEmbedFileType) + '}';
    }
}
