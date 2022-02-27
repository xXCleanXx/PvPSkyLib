package de.xxcleanxx.pvpskylib.common.mysql;

public class Holder<T> {
	private T _value;

	public T getValue() {
		return this._value;
	}

	public void setValue(T value) {
		this._value = value;
	}
}