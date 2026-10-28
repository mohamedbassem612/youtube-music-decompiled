package defpackage;

import android.content.Context;
import android.content.res.Resources;
import androidx.window.sidecar.SidecarDisplayFeature;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class akl implements awqg {
    private final /* synthetic */ int $cid;

    public /* synthetic */ akl(int i) {
        this.$cid = i;
    }

    @Override // defpackage.awqg
    public final Object invoke(Object obj) throws IOException {
        String strValueOf;
        switch (this.$cid) {
            case 0:
                return Boolean.valueOf(!(((ako) obj) instanceof akk));
            case 1:
                Resources resources = (Resources) obj;
                resources.getClass();
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 2:
                return ((Context) ahs.g((ajm) obj, aog.b)).getResources().getConfiguration();
            case 3:
                ajm ajmVar = (ajm) obj;
                ahs.g(ajmVar, aog.a);
                return ((Context) ahs.g(ajmVar, aog.b)).getResources();
            case 4:
                return (apc) atqq.W((Iterable) ahs.g((ajm) obj, aoq.b));
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                return awmy.a;
            case 8:
                return awmy.a;
            case 9:
                return awmy.a;
            case 10:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    byte[] bArr = (byte[]) value;
                    bArr.getClass();
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) "[");
                    int i = 0;
                    for (byte b : bArr) {
                        i++;
                        if (i > 1) {
                            sb.append((CharSequence) ", ");
                        }
                        sb.append((CharSequence) String.valueOf((int) b));
                    }
                    sb.append((CharSequence) "]");
                    strValueOf = sb.toString();
                } else {
                    strValueOf = String.valueOf(entry.getValue());
                }
                return "  " + ((bhi) entry.getKey()).a + " = " + strValueOf;
            case 11:
                ((dlx) obj).getClass();
                throw new awmk("An operation is not implemented.");
            case 12:
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
                int i2 = dxq.a;
                sidecarDisplayFeature.getClass();
                return Boolean.valueOf(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2);
            case 13:
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                int i3 = dxq.a;
                sidecarDisplayFeature2.getClass();
                return Boolean.valueOf((sidecarDisplayFeature2.getRect().width() == 0 && sidecarDisplayFeature2.getRect().height() == 0) ? false : true);
            case 14:
                SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                int i4 = dxq.a;
                sidecarDisplayFeature3.getClass();
                return Boolean.valueOf(sidecarDisplayFeature3.getType() != 1 || sidecarDisplayFeature3.getRect().width() == 0 || sidecarDisplayFeature3.getRect().height() == 0);
            case 15:
                SidecarDisplayFeature sidecarDisplayFeature4 = (SidecarDisplayFeature) obj;
                int i5 = dxq.a;
                sidecarDisplayFeature4.getClass();
                return Boolean.valueOf(sidecarDisplayFeature4.getRect().left == 0 || sidecarDisplayFeature4.getRect().top == 0);
            case 16:
                Map.Entry entry2 = (Map.Entry) obj;
                dyp dypVar = dyp.a;
                entry2.getClass();
                String str = (String) entry2.getKey();
                Object value2 = entry2.getValue();
                if (value2 instanceof Object[]) {
                    value2 = Arrays.toString((Object[]) value2);
                    value2.getClass();
                }
                return str + " : " + value2;
            case 17:
                ees eesVar = (ees) obj;
                eesVar.getClass();
                return true != eesVar.e() ? "OneTime" : "Periodic";
            case 18:
                ecy ecyVar = (ecy) obj;
                ecyVar.getClass();
                String simpleName = ecyVar.getClass().getSimpleName();
                simpleName.getClass();
                return simpleName;
            case 19:
                return awmy.a;
            default:
                ((agrc) ((agrc) hcc.a.c()).j((Throwable) obj).k("com/google/android/apps/youtube/music/entities/data/MusicPersistentEntityStoreWriterImpl", "removeEntitiesByKeys$<anonymous>", 76, "MusicPersistentEntityStoreWriterImpl.kt")).t("Failed to batch remove entities by keys");
                return awmy.a;
        }
    }
}
