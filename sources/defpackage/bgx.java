package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bgx implements bdx {
    private final awqk a;
    private final awql b;
    private final Context c;
    private final String d;
    private final awmi e;
    private final Set f;

    public bgx(Function0 function0, Set set, awqk awqkVar, awql awqlVar, Context context, String str) {
        this.a = awqkVar;
        this.b = awqlVar;
        this.c = context;
        this.d = str;
        this.e = new awmp(function0);
        this.f = set == bgy.a ? null : atqq.av(set);
    }

    private final SharedPreferences d() {
        return (SharedPreferences) this.e.a();
    }

    @Override // defpackage.bdx
    public final Object a(Object obj, awoq awoqVar) {
        return this.b.invoke(new eol(d(), this.f), obj, awoqVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.bdx
    public final Object b(Object obj, awoq awoqVar) throws Throwable {
        bgw bgwVar;
        if (awoqVar instanceof bgw) {
            bgwVar = (bgw) awoqVar;
            int i = bgwVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bgwVar.c = i - Integer.MIN_VALUE;
            } else {
                bgwVar = new bgw(this, awoqVar);
            }
        } else {
            bgwVar = new bgw(this, awoqVar);
        }
        Object objInvoke = bgwVar.a;
        awox awoxVar = awox.a;
        int i2 = bgwVar.c;
        boolean z = true;
        if (i2 == 0) {
            atqp.j(objInvoke);
            awqk awqkVar = this.a;
            bgwVar.c = 1;
            objInvoke = awqkVar.invoke(obj, bgwVar);
            if (objInvoke == awoxVar) {
                return awoxVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            atqp.j(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return Boolean.FALSE;
        }
        Set set = this.f;
        if (set == null) {
            Map<String, ?> all = d().getAll();
            all.getClass();
            if (all.isEmpty()) {
                z = false;
            }
        } else {
            SharedPreferences sharedPreferencesD = d();
            if (set.isEmpty()) {
                z = false;
            } else {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (sharedPreferencesD.contains((String) it.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bdx
    public final Object c() throws IOException {
        Context context;
        String str;
        SharedPreferences.Editor editorEdit = d().edit();
        Set set = this.f;
        if (set == null) {
            editorEdit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                editorEdit.remove((String) it.next());
            }
        }
        if (!editorEdit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (d().getAll().isEmpty() && (context = this.c) != null && (str = this.d) != null) {
            context.deleteSharedPreferences(str);
        }
        if (set != null) {
            set.clear();
        }
        return awmy.a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bgx(Context context, String str, Set set, awqk awqkVar, awql awqlVar) {
        this(new bgz(context, str, 1), set, awqkVar, awqlVar, context, str);
        context.getClass();
        set.getClass();
    }
}
