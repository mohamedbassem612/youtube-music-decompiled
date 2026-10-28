package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.music.R;
import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class spi extends spk {
    public boolean e;
    public boolean f;
    public abhv g;
    public abwk h;
    private final Context i;
    private final int j;
    private final vyo k;

    public spi(Context context, vyo vyoVar) {
        super(sow.a().f());
        context.getClass();
        this.i = context;
        this.j = R.string.ad_learn_more;
        this.k = vyoVar;
    }

    @Override // defpackage.spf
    public final /* synthetic */ void a(Object obj, boolean z) {
        sow sowVar = (sow) obj;
        CharSequence string = sowVar.b;
        boolean z2 = sowVar.a;
        int i = 8;
        if (!((sow) this.a).b.equals(string) || ((sow) this.a).a != z2) {
            if (z2) {
                if (Objects.equals(string, "<NONE>")) {
                    Context context = this.i;
                    string = context.getResources().getString(this.j);
                }
                abhv abhvVar = this.g;
                if (abhvVar != null) {
                    abhvVar.a.setText(string);
                }
            } else {
                abhv abhvVar2 = this.g;
                if (abhvVar2 != null) {
                    abhvVar2.a(8);
                }
            }
        }
        abhv abhvVar3 = this.g;
        if (abhvVar3 != null) {
            if (z && e(z2, this.e)) {
                i = 0;
            }
            abhvVar3.a(i);
        }
    }

    public final boolean e(boolean z, boolean z2) {
        aizx aizxVarE = afxw.e(this.k);
        return (aizxVarE == null || !aizxVarE.aU) && z && !z2;
    }
}
