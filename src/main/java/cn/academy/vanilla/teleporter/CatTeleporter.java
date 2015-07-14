/**
 * Copyright (c) Lambda Innovation, 2013-2015
 * 本作品版权由Lambda Innovation所有。
 * http://www.li-dev.cn/
 *
 * This project is open-source, and it is distributed under  
 * the terms of GNU General Public License. You can modify
 * and distribute freely as long as you follow the license.
 * 本项目是一个开源项目，且遵循GNU通用公共授权协议。
 * 在遵照该协议的情况下，您可以自由传播和修改。
 * http://www.gnu.org/licenses/gpl.html
 */
package cn.academy.vanilla.teleporter;

import cn.academy.ability.api.Category;
import cn.academy.vanilla.ModuleVanilla;
import cn.academy.vanilla.teleporter.skills.LocationTeleport;
import cn.academy.vanilla.teleporter.skills.MarkTeleport;
import cn.academy.vanilla.teleporter.skills.PenetrateTeleport;

/**
 * @author WeAthFolD
 */
public class CatTeleporter extends Category {

	public static MarkTeleport markTeleport;
	
	public static LocationTeleport locTeleport;
	
	public static PenetrateTeleport penetrateTeleport;
	
	public CatTeleporter() {
		super("teleporter");
		
		this.defineTypes("default", "passive");
		
		this.addSkill("default", markTeleport = new MarkTeleport());
		this.addSkill("default", locTeleport = new LocationTeleport());
		this.addSkill("default", penetrateTeleport = new PenetrateTeleport());
		
		ModuleVanilla.addGenericSkills(this);
	}

}
