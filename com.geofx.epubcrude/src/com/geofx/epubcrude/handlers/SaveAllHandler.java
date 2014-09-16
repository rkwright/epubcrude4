package com.geofx.epubcrude.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.CanExecute;

public class SaveAllHandler
{
	@Execute
	public void execute()
	{

	}

	@CanExecute
	public boolean canExecute()
	{

		return true;
	}

}