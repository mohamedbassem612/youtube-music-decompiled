package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileOutputStream;
import java.io.SyncFailedException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qqh extends qqk implements qpw, qpv, qqe {
    private final FileOutputStream a;
    private final File b;

    public qqh(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.a = fileOutputStream;
        this.b = file;
    }

    @Override // defpackage.qqe
    public final void a() throws SyncFailedException {
        this.a.getFD().sync();
    }

    @Override // defpackage.qpv
    public final FileChannel b() {
        return DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel());
    }

    @Override // defpackage.qpw
    public final File c() {
        return this.b;
    }
}
