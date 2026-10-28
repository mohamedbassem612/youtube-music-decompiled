package defpackage;

import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.speech.tts.TextToSpeech;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tsp implements Callable {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;

    public /* synthetic */ tsp(Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        auij auijVar;
        int i = 7;
        switch (this.$cid) {
            case 0:
                agrf agrfVar = tsr.a;
                ((TextToSpeech) this.a).stop();
                return null;
            case 1:
                tpr tprVar = (tpr) this.a;
                SharedPreferences.Editor editorEdit = ((SharedPreferences) tprVar.a.io()).edit();
                agqr it = tprVar.b.keySet().iterator();
                while (it.hasNext()) {
                    editorEdit.remove((String) it.next());
                }
                if (!editorEdit.commit()) {
                    throw new IOException("Failed to clear the keys from SharedPreferences.");
                }
                tprVar.b = agpn.b;
                return null;
            case 2:
                return Integer.valueOf(((xgl) this.a).c());
            case 3:
            case 4:
            case 5:
                return this.a;
            case 6:
                Object obj = this.a;
                ums umsVar = (ums) obj;
                return umsVar.e.K().O(umsVar.b).af(new uln(obj, 15));
            case 7:
                byte[] bArr = (byte[]) this.a;
                return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            case 8:
                agrf agrfVar2 = uql.a;
                File file = (File) this.a;
                return Boolean.valueOf(file.exists() && file.delete());
            case 9:
                Object obj2 = this.a;
                try {
                    vex vexVar = ((vfb) obj2).d;
                    vexVar.getClass();
                    String path = vexVar.a.getPath();
                    path.getClass();
                    nuo.n(new File(path), ((vfb) obj2).m());
                    return Boolean.TRUE;
                } catch (IOException unused) {
                    return Boolean.FALSE;
                }
            case 10:
                vfb vfbVar = (vfb) this.a;
                File fileK = vfbVar.k();
                fileK.delete();
                auij auijVar2 = vfbVar.b;
                if (auijVar2 == null) {
                    return Boolean.FALSE;
                }
                if ((auijVar2.b & 1) == 0) {
                    return Boolean.FALSE;
                }
                File file2 = new File(auijVar2.c);
                if (!file2.exists()) {
                    return Boolean.FALSE;
                }
                nuo.n(file2, fileK);
                return Boolean.TRUE;
            case 11:
                vfb vfbVar2 = (vfb) this.a;
                File fileK2 = vfbVar2.k();
                if (!fileK2.exists() || (auijVar = vfbVar2.b) == null) {
                    return Boolean.FALSE;
                }
                if ((auijVar.b & 1) == 0) {
                    return Boolean.FALSE;
                }
                nuo.n(fileK2, new File(auijVar.c));
                return Boolean.TRUE;
            case 12:
                vtg vtgVar = (vtg) this.a;
                return vtgVar.e().ak(new vpi(vtgVar.f, i));
            case 13:
                vtg vtgVar2 = (vtg) this.a;
                return vtgVar2.l().ak(new vpi(vtgVar2.g, i));
            case 14:
                Object obj3 = this.a;
                return ((vtg) obj3).h.ak(new vpi(obj3, 6));
            case 15:
                Object obj4 = this.a;
                return ((vtt) obj4).b.c().ak(new vpi(obj4, 12));
            case 16:
                return ((vuk) this.a).m.ak(new vqe(5));
            case 17:
                vuk vukVar = (vuk) this.a;
                return vukVar.v.y().E(new vtu(vukVar.s, 2));
            case 18:
                return Long.valueOf(((wbx) this.a).a());
            case 19:
                return Long.valueOf(((wbx) this.a).b());
            default:
                Object obj5 = this.a;
                obj5.getClass();
                return Long.valueOf(((wbx) obj5).a());
        }
    }
}
