package defpackage;

import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class eya implements euh {
    private final File a;

    public eya(File file) {
        this.a = file;
    }

    @Override // defpackage.euh
    public final Class a() {
        return ByteBuffer.class;
    }

    @Override // defpackage.euh
    public final void f(esf esfVar, eug eugVar) throws Throwable {
        Throwable th;
        RandomAccessFile randomAccessFile;
        try {
            File file = this.a;
            int i = fff.a;
            FileChannel fileChannel = null;
            try {
                long length = file.length();
                if (length > 2147483647L) {
                    throw new IOException("File too large to map into memory");
                }
                if (length == 0) {
                    throw new IOException("File unsuitable for memory mapping");
                }
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    FileChannel fileChannelConvertMaybeLegacyFileChannelFromLibrary = DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
                    try {
                        MappedByteBuffer mappedByteBufferLoad = fileChannelConvertMaybeLegacyFileChannelFromLibrary.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                        if (fileChannelConvertMaybeLegacyFileChannelFromLibrary != null) {
                            try {
                                fileChannelConvertMaybeLegacyFileChannelFromLibrary.close();
                            } catch (IOException unused) {
                            }
                        }
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused2) {
                        }
                        eugVar.b(mappedByteBufferLoad);
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = fileChannelConvertMaybeLegacyFileChannelFromLibrary;
                        if (fileChannel != null) {
                            try {
                                fileChannel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused4) {
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                randomAccessFile = null;
            }
        } catch (IOException e) {
            eugVar.e(e);
        }
    }

    @Override // defpackage.euh
    public final int g() {
        return 1;
    }

    @Override // defpackage.euh
    public final void d() {
    }

    @Override // defpackage.euh
    public final void gI() {
    }
}
