package defpackage;

import androidx.media3.decoder.DecoderInputBuffer;
import app.rive.semantics.SemanticState;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public final class dbc extends cas implements dbe {
    private final String a;
    private final dbn b;

    public dbc(String str, dbn dbnVar) {
        super(new dbi[2], new dbj[2]);
        this.a = str;
        i(SemanticState.ReadOnly);
        this.b = dbnVar;
    }

    @Override // defpackage.cas
    protected final /* synthetic */ can a(Throwable th) {
        return new dbf(th);
    }

    @Override // defpackage.cas
    protected final /* bridge */ /* synthetic */ can b(DecoderInputBuffer decoderInputBuffer, caq caqVar, boolean z) {
        dbi dbiVar = (dbi) decoderInputBuffer;
        dbj dbjVar = (dbj) caqVar;
        try {
            ByteBuffer byteBuffer = dbiVar.data;
            byteBuffer.getClass();
            byte[] bArrArray = byteBuffer.array();
            int iLimit = byteBuffer.limit();
            if (z) {
                this.b.d();
            }
            dbjVar.d(dbiVar.timeUs, this.b.b(bArrArray, 0, iLimit), dbiVar.a);
            dbjVar.shouldBeSkipped = false;
            return null;
        } catch (dbf e) {
            return e;
        }
    }

    @Override // defpackage.cas
    protected final /* synthetic */ DecoderInputBuffer c() {
        return new dbi();
    }

    @Override // defpackage.cas
    protected final /* synthetic */ caq e() {
        return new dbb(this);
    }

    @Override // defpackage.cam
    public final String getName() {
        return this.a;
    }

    @Override // defpackage.dbe
    public final void l(long j) {
    }
}
