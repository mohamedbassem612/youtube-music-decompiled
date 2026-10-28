package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jkp implements SharedPreferences {
    public final zwb a;
    private final SharedPreferences b;

    public jkp(zwb zwbVar, SharedPreferences sharedPreferences) {
        sharedPreferences.getClass();
        this.b = sharedPreferences;
        zwbVar.getClass();
        this.a = zwbVar;
    }

    @Override // android.content.SharedPreferences
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final jko edit() {
        return new jko(this, this.b.edit());
    }

    public final String b(String str) {
        return TextUtils.concat(this.a.e().k(), "_", str).toString();
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.b.contains(b(str));
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        return this.b.getAll();
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return this.b.getBoolean(b(str), z);
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return this.b.getFloat(b(str), f);
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return this.b.getInt(b(str), i);
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return this.b.getLong(b(str), j);
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return this.b.getString(b(str), str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return this.b.getStringSet(b(str), set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
