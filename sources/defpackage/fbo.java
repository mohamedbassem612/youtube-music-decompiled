package defpackage;

import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fbo implements fbp {
    private final /* synthetic */ int $cid;

    public fbo(int i) {
        this.$cid = i;
    }

    @Override // defpackage.fbp
    public final /* synthetic */ void a(MediaExtractor mediaExtractor, Object obj) throws IOException {
        int i = this.$cid;
        if (i == 0) {
            mediaExtractor.setDataSource(new fbn((ByteBuffer) obj));
        } else if (i != 1) {
            mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }

    @Override // defpackage.fbp
    public final /* synthetic */ void b(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        int i = this.$cid;
        if (i == 0) {
            mediaMetadataRetriever.setDataSource(new fbn((ByteBuffer) obj));
        } else if (i != 1) {
            mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
        } else {
            AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }
    }
}
