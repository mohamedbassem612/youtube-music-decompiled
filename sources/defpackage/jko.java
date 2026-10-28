package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jko implements SharedPreferences.Editor {
    final /* synthetic */ jkp a;
    private final SharedPreferences.Editor b;

    public jko(jkp jkpVar, SharedPreferences.Editor editor) {
        this.a = jkpVar;
        editor.getClass();
        this.b = editor;
    }

    public final void a(String str, boolean z) {
        this.b.putBoolean(this.a.b(str), z);
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        this.b.apply();
    }

    public final void b(String str, int i) {
        this.b.putInt(this.a.b(str), i);
    }

    public final void c(zwa zwaVar, String str) {
        zwaVar.getClass();
        this.b.remove(TextUtils.concat(zwaVar.k(), "_", str).toString());
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor clear() {
        this.b.clear();
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        return this.b.commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putBoolean(String str, boolean z) {
        a(str, z);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putFloat(String str, float f) {
        this.b.putFloat(this.a.b(str), f);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putInt(String str, int i) {
        b(str, i);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putLong(String str, long j) {
        this.b.putLong(this.a.b(str), j);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putString(String str, String str2) {
        this.b.putString(this.a.b(str), str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor putStringSet(String str, Set set) {
        this.b.putStringSet(this.a.b(str), set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final /* bridge */ /* synthetic */ SharedPreferences.Editor remove(String str) {
        this.b.remove(this.a.b(str));
        return this;
    }
}
