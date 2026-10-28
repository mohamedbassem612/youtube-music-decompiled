package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qqg extends qqj implements qpw, qpv, qqd {
    private final FileInputStream a;
    private final File b;

    public qqg(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.a = fileInputStream;
        this.b = file;
    }

    @Override // defpackage.qqd
    public final Long a() {
        return Long.valueOf(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(this.a.getChannel()).size());
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
